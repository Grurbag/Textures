// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class custom_model extends ModelBase {
	private final ModelRenderer helmet;
	private final ModelRenderer helmet2;

	public custom_model() {
		textureWidth = 64;
		textureHeight = 32;

		helmet = new ModelRenderer(this);
		helmet.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.cubeList.add(new ModelBox(helmet, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

		helmet2 = new ModelRenderer(this);
		helmet2.setRotationPoint(0.0F, -12.0F, -2.0F);
		helmet.addChild(helmet2);
		setRotationAngle(helmet2, -0.2618F, 0.0F, 0.0F);
		helmet2.cubeList.add(new ModelBox(helmet2, 38, 17, -6.5F, -9.0F, -0.5F, 13, 15, 0, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		helmet.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}