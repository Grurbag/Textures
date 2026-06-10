// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class custom_model extends ModelBase {
	private final ModelRenderer rightleg;
	private final ModelRenderer rightleg_r1;
	private final ModelRenderer leftleg;
	private final ModelRenderer leftleg_r1;

	public custom_model() {
		textureWidth = 64;
		textureHeight = 64;

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		rightleg.cubeList.add(new ModelBox(rightleg, 42, 0, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.39F, true));
		rightleg.cubeList.add(new ModelBox(rightleg, 0, 7, -2.0F, 3.75F, -2.0F, 4, 6, 4, 0.55F, true));

		rightleg_r1 = new ModelRenderer(this);
		rightleg_r1.setRotationPoint(1.9F, 0.0F, 0.0F);
		rightleg.addChild(rightleg_r1);
		setRotationAngle(rightleg_r1, 0.0F, 0.0F, 0.0262F);
		rightleg_r1.cubeList.add(new ModelBox(rightleg_r1, 32, 16, -4.2F, -1.0F, -2.0F, 4, 9, 4, 0.6F, true));

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(3.8F, 0.0F, 0.0F);
		rightleg.addChild(leftleg);
		leftleg.cubeList.add(new ModelBox(leftleg, 42, 0, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.39F, false));
		leftleg.cubeList.add(new ModelBox(leftleg, 0, 7, -2.0F, 3.75F, -2.0F, 4, 6, 4, 0.55F, false));

		leftleg_r1 = new ModelRenderer(this);
		leftleg_r1.setRotationPoint(-1.9F, 0.0F, 0.0F);
		leftleg.addChild(leftleg_r1);
		setRotationAngle(leftleg_r1, 0.0F, 0.0F, -0.0262F);
		leftleg_r1.cubeList.add(new ModelBox(leftleg_r1, 48, 16, 0.2F, -1.0F, -2.0F, 4, 9, 4, 0.6F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		rightleg.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}