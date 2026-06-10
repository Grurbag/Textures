// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class custom_model extends ModelBase {
	private final ModelRenderer leftleg3;
	private final ModelRenderer leftleg3_r1;
	private final ModelRenderer rightleg3;
	private final ModelRenderer leftleg4_r1;

	public custom_model() {
		textureWidth = 64;
		textureHeight = 64;

		leftleg3 = new ModelRenderer(this);
		leftleg3.setRotationPoint(1.9F, 12.0F, 0.0F);
		leftleg3.cubeList.add(new ModelBox(leftleg3, 0, 0, -2.0F, 8.0F, -2.0F, 4, 4, 4, 0.4F, false));

		leftleg3_r1 = new ModelRenderer(this);
		leftleg3_r1.setRotationPoint(-1.9F, 12.0F, -2.4F);
		leftleg3.addChild(leftleg3_r1);
		setRotationAngle(leftleg3_r1, 0.1745F, 0.0F, 0.0F);
		leftleg3_r1.cubeList.add(new ModelBox(leftleg3_r1, 3, 6, -0.1F, -1.0F, -0.7F, 4, 1, 1, 0.3F, false));

		rightleg3 = new ModelRenderer(this);
		rightleg3.setRotationPoint(-3.8F, 0.0F, 0.0F);
		leftleg3.addChild(rightleg3);
		rightleg3.cubeList.add(new ModelBox(rightleg3, 0, 0, -2.0F, 8.0F, -2.0F, 4, 4, 4, 0.4F, true));

		leftleg4_r1 = new ModelRenderer(this);
		leftleg4_r1.setRotationPoint(1.9F, 12.0F, -2.4F);
		rightleg3.addChild(leftleg4_r1);
		setRotationAngle(leftleg4_r1, 0.1745F, 0.0F, 0.0F);
		leftleg4_r1.cubeList.add(new ModelBox(leftleg4_r1, 3, 6, -3.9F, -1.0F, -0.7F, 4, 1, 1, 0.3F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		leftleg3.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}