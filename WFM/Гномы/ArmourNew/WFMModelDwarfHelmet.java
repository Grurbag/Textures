// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelDwarfHelmet extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer horn_r1;
	private final ModelRenderer horn2_r1;
	private final ModelRenderer Head_r1;

	public WFMModelDwarfHelmet() {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(Head, 0.0F, 3.1416F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.75F, false));
		Head.cubeList.add(new ModelBox(Head, 32, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 1.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 50, -6.0F, -6.0F, -6.0F, 12, 2, 12, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 41, -4.0F, -10.0F, -4.0F, 8, 1, 8, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 40, 46, -2.0F, -12.0F, -1.0F, 4, 7, 8, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 44, 36, -1.0F, -11.0F, -5.5F, 2, 5, 5, 0.0F, false));

		horn_r1 = new ModelRenderer(this);
		horn_r1.setRotationPoint(-6.0F, -7.5F, 0.0F);
		Head.addChild(horn_r1);
		setRotationAngle(horn_r1, -3.1416F, 0.0F, 2.9671F);
		horn_r1.cubeList.add(new ModelBox(horn_r1, 0, 55, -12.8264F, 1.4848F, -1.5F, 3, 3, 3, 0.0F, false));
		horn_r1.cubeList.add(new ModelBox(horn_r1, 44, 22, -20.8264F, -9.5152F, 0.0F, 10, 14, 0, 0.0F, false));

		horn2_r1 = new ModelRenderer(this);
		horn2_r1.setRotationPoint(-6.0F, -7.5F, 0.0F);
		Head.addChild(horn2_r1);
		setRotationAngle(horn2_r1, 0.0F, 0.0F, 0.1745F);
		horn2_r1.cubeList.add(new ModelBox(horn2_r1, 44, 22, -8.8264F, -11.5152F, 0.0F, 10, 14, 0, 0.0F, false));
		horn2_r1.cubeList.add(new ModelBox(horn2_r1, 0, 55, -0.8264F, -0.5152F, -1.5F, 3, 3, 3, 0.0F, false));

		Head_r1 = new ModelRenderer(this);
		Head_r1.setRotationPoint(0.0F, -5.0F, 5.0F);
		Head.addChild(Head_r1);
		setRotationAngle(Head_r1, 0.0F, 0.0F, -0.7854F);
		Head_r1.cubeList.add(new ModelBox(Head_r1, 28, 41, -1.7071F, -1.2929F, -2.1F, 3, 3, 4, 0.0F, false));
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