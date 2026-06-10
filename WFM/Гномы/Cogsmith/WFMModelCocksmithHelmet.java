// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelCocksmithHelmet extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer greben;

	public WFMModelCocksmithHelmet() {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 22.0F, 0.0F);
		setRotationAngle(Head, 0.0F, 3.1416F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.75F, false));
		Head.cubeList.add(new ModelBox(Head, 32, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 1.0F, false));
		Head.cubeList.add(new ModelBox(Head, 52, 16, 1.0F, -5.0F, 4.0F, 3, 3, 3, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 52, 16, -4.0F, -5.0F, 4.0F, 3, 3, 3, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 41, -4.0F, -10.0F, -4.0F, 8, 1, 8, 0.0F, false));

		greben = new ModelRenderer(this);
		greben.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(greben);
		greben.cubeList.add(new ModelBox(greben, 42, 52, -1.5F, -12.0F, -4.0F, 3, 2, 8, 0.0F, false));
		greben.cubeList.add(new ModelBox(greben, 58, 49, -1.0F, -11.0F, 4.0F, 2, 2, 1, 0.0F, false));
		greben.cubeList.add(new ModelBox(greben, 60, 40, -0.5F, -10.0F, 5.0F, 1, 4, 1, 0.0F, false));
		greben.cubeList.add(new ModelBox(greben, 60, 40, -0.5F, -10.0F, -6.0F, 1, 4, 1, 0.0F, false));
		greben.cubeList.add(new ModelBox(greben, 58, 49, -1.0F, -11.0F, -5.0F, 2, 2, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Head.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}