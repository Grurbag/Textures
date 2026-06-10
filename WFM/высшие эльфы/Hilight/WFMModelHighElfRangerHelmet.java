// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelHighElfRangerHelmet extends ModelBase {
	private final ModelRenderer helmet;
	private final ModelRenderer helmet2;
	private final ModelRenderer helmet3;
	private final ModelRenderer helmet4;

	public WFMModelHighElfRangerHelmet() {
		textureWidth = 64;
		textureHeight = 32;

		helmet = new ModelRenderer(this);
		helmet.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.cubeList.add(new ModelBox(helmet, 0, 16, -4.0F, -7.2F, -4.0F, 8, 8, 8, 0.4F, false));

		helmet2 = new ModelRenderer(this);
		helmet2.setRotationPoint(0.0F, 24.0F, 0.0F);
		helmet.addChild(helmet2);
		helmet2.cubeList.add(new ModelBox(helmet2, 32, 0, -4.0F, -32.2F, -4.0F, 8, 2, 8, 0.21F, false));

		helmet3 = new ModelRenderer(this);
		helmet3.setRotationPoint(0.0F, 24.0F, 0.0F);
		helmet.addChild(helmet3);
		setRotationAngle(helmet3, -0.1309F, 0.0F, 0.0F);
		helmet3.cubeList.add(new ModelBox(helmet3, 37, 22, -5.0F, -37.8F, -7.5F, 10, 9, 1, 0.0F, false));

		helmet4 = new ModelRenderer(this);
		helmet4.setRotationPoint(0.0F, 24.0F, 0.0F);
		helmet.addChild(helmet4);
		helmet4.cubeList.add(new ModelBox(helmet4, 0, 0, -4.0F, -31.2F, -4.0F, 8, 8, 8, 0.2F, false));
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